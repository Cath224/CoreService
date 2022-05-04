package com.ateupeonding.coreservice.controller;

public final class ApiPaths {


    public static final String PATH = "api/v1";

    public static final class Account {
        public static final String PATH = ApiPaths.PATH + "/accounts";
    }

    public static final class Project {
        public static final String PATH = ApiPaths.PATH + "/projects";
    }

    public static final class Goal {
        public static final String PATH = ApiPaths.PATH + "/goals";
    }

    public static final class Tier {
        public static final String PATH = ApiPaths.PATH + "/tiers";
    }

    public static final class UserGoal {
        public static final String PATH = ApiPaths.PATH + "/usersGoals";
    }

    public static final class UserTier {
        public static final String PATH = ApiPaths.PATH + "/usersTiers";
    }

    public static final class Notification {
        public static final String PATH = ApiPaths.PATH + "/notifications";
    }
}
