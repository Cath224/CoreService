create table if not exists ateupeonding_core.notification
(
    id          uuid default gen_random_uuid() primary key,
    title       text not null,
    description text,
    account_id  uuid not null references ateupeonding_core.account (id) on DELETE cascade
);

create index if not exists ateupeonding_core_notification_account_id on ateupeonding_core.notification (account_id);

