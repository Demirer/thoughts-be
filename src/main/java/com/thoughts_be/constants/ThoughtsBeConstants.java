package com.thoughts_be.constants;

public class ThoughtsBeConstants {

    private ThoughtsBeConstants(){
        throw new IllegalStateException(CONSTRUCTOR_ACCESS_ERROR);
    }

    static final String CONSTRUCTOR_ACCESS_ERROR = "ThoughtsBeConstants.java cannot be accessed with constructor";
    public static final String APPLICATION_MESSAGE_RESOURCE_FILE_NAME = "ThoughtsBeApplicationMessages";
    public static final Integer SUCCESS = 0;
    public static final Integer ERROR = -1;

    public static class AdapterPatternConstants{
        private AdapterPatternConstants(){
            throw new IllegalStateException(CONSTRUCTOR_ACCESS_ERROR);
        }

        public static final String ECONOMICAL_DATA = "E";
        public static final String GEOGRAPHICAL_DATA = "G";
        public static final String HEALTH_SERVICE_DATA = "H";
    }
}
