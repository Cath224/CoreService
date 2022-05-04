create schema if not exists ateupeonding_core;


create table if not exists ateupeonding_core.account
(
    id                uuid primary key         default gen_random_uuid(),
    fist_name         text not null,
    last_name         text not null,
    email             text not null,
    user_id           uuid not null unique,
    created_timestamp timestamp with time zone default now()
);


DO
$$
    BEGIN
        IF NOT EXISTS(SELECT 1 FROM pg_type WHERE typname = 'project_type') THEN
            CREATE TYPE ateupeonding_core.project_type AS enum
                (
                    'ONE_TIME',
                    'PERMANENT'
                    );
        END IF;
    END
$$;

create table if not exists ateupeonding_core.project
(
    id                uuid primary key         default gen_random_uuid(),
    title             text                                           not null,
    description       text,
    type              ateupeonding_core.project_type                                   not null,
    account_id        uuid references ateupeonding_core.account (id) on delete cascade not null,
    created_timestamp timestamp with time zone default now()
);

create index if not exists ateupeonding_core_project_account_id on ateupeonding_core.project (account_id);

create table if not exists ateupeonding_core.goal
(
    id                uuid primary key         default gen_random_uuid(),
    title             text                                           not null,
    amount            decimal                                        not null,
    project_id        uuid references ateupeonding_core.project (id)  on delete cascade not null,
    created_timestamp timestamp with time zone default now()
);

create index if not exists ateupeonding_core_goal_project_id on ateupeonding_core.goal (project_id);


DO
$$
    BEGIN
        IF NOT EXISTS(SELECT 1 FROM pg_type WHERE typname = 'payment_status') THEN
            CREATE TYPE ateupeonding_core.payment_status AS enum
                (
                    'IN_PROGRESS',
                    'PAYED',
                    'DENIED'
                    );
        END IF;
    END
$$;

create table if not exists ateupeonding_core.user_goal
(
    id                uuid primary key         default gen_random_uuid(),
    goal_id           uuid           not null references ateupeonding_core.goal (id)  on delete cascade,
    account_id        uuid           not null references ateupeonding_core.account (id)  on delete cascade,
    amount            decimal        not null,
    status            ateupeonding_core.payment_status not null  default 'IN_PROGRESS'::ateupeonding_core.payment_status,
    created_timestamp timestamp with time zone default now()
);

create unique index if not exists ateupeonding_core_user_goal_goal_id_account_id on ateupeonding_core.user_goal (account_id, goal_id);

create table if not exists ateupeonding_core.tier
(
    id                uuid primary key         default gen_random_uuid(),
    title             text                                           not null,
    description       text,
    amount            decimal                                        not null,
    project_id        uuid references ateupeonding_core.project (id)  on delete cascade not null,
    created_timestamp timestamp with time zone default now()
);


create index if not exists ateupeonding_core_tier_project_id on ateupeonding_core.tier (project_id);

create table if not exists ateupeonding_core.user_tier
(
    id                uuid primary key         default gen_random_uuid(),
    tier_id           uuid           not null references ateupeonding_core.tier (id)  on delete cascade,
    account_id        uuid           not null references ateupeonding_core.account (id)  on delete cascade,
    amount            decimal        not null,
    status            ateupeonding_core.payment_status not null  default 'IN_PROGRESS'::ateupeonding_core.payment_status,
    created_timestamp timestamp with time zone default now()
);

create unique index if not exists ateupeonding_core_user_tier_tier_id_account_id on ateupeonding_core.user_tier (account_id, tier_id);

