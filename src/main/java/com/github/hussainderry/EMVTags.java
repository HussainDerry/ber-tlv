package com.github.hussainderry;

import com.payneteasy.tlv.BerTag;

public class EMVTags {

    public static final BerTag FILE_CONTROL_INFROMATION = new BerTag(0x6F);
    public static final BerTag DEDICATED_FILE_NAME = new BerTag(0x84);
    public static final BerTag EMV_TEMPLATE = new BerTag(0x70);
    public static final BerTag APPLICATION_TEMPLATE = new BerTag(0x61);
    public static final BerTag SHORT_FILE_IDENTIFIER = new BerTag(0x88);
    public static final BerTag APPLICATION_EXPIRY_DATE = new BerTag(0x5F, 0x24);
    public static final BerTag APPLICATION_IDENTIFIER = new BerTag(0x4F);
    public static final BerTag APPLICATION_LABEL = new BerTag(0x50);
    public static final BerTag APPLICATION_PREFERRED_NAME = new BerTag(0x9F, 0x12);
    public static final BerTag APPLICATION_PRIORITY_INDICATOR = new BerTag(0x87);
    public static final BerTag APPLICATION_PRIMARY_ACCOUNT_NUMBER = new BerTag(0x5A);

}
