// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arcsoft.mediaplus.updownload.db;


public class EasyTransferTable
{
    public static interface Columns
    {

        public static final String ALLOW_MOVE = "allow_move";
        public static final String DMS_NAME = "dms_name";
        public static final String DMS_UUID = "dms_uuid";
        public static final String ENABLE_PLUGIN = "enable_plugin";
        public static final String RECORD_DATE = "record_day";
        public static final String RETRY_COUNT = "retry_count";
        public static final String SERVER_STATE = "server_state";
        public static final String START_HOUR = "start_hour";
        public static final String START_MINUTE = "start_minute";
        public static final String _ID = "_id";
    }


    public static final String PROJECTION_ARRAY[] = {
        "_id", "dms_name", "dms_uuid", "server_state", "start_hour", "start_minute", "record_day", "retry_count", "allow_move", "enable_plugin"
    };
    public static final String SORT_ORDER_BY_ID = "";
    public static final String TABLE_NAME = "EasyTransferTable";

    public EasyTransferTable()
    {
    }

}
