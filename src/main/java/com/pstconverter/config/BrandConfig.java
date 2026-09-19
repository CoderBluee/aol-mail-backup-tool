package com.pstconverter.config;

public final class BrandConfig {

    // Tools Data
    public static final String TOOL_NAME = "Prism AOL Mail Backup Tool";
    public static final String VERSION = java.time.LocalDate.now()
            .format(java.time.format.DateTimeFormatter.ofPattern("yyyy.MM"));
    public static final String COMPANY_NAME = "Prism Software";

    // Unique Product ID — must match the Product ID registered in the backend CRM (Admin Panel).
    public static final String PRODUCT_ID = "aol-mail-backup-tool";

    // Unique Brand ID — matches the siteId in the CRM
    public static final String BRAND_ID = "brandA";

    // Webpage Links
    public static final String HOME_PAGE_URL = "https://www.prismaolbackup.com";
    public static final String SUPPORT_URL = "https://www.prismaolbackup.com/support";
    public static final String UPGRADE_URL = "https://www.prismaolbackup.com/upgrade";
    public static final String LICENSE_API_URL = System.getenv("LICENSE_API_URL") != null 
            ? System.getenv("LICENSE_API_URL") 
            : "https://api.thecrazyufo.in/api/license/activate?siteId=brandA";
    public static final String FAQ_URL = "https://www.prismaolbackup.com/faq";
    public static final String PRIVACY_POLICY_URL = "https://www.prismaolbackup.com/privacy-policy";
    public static final String TERMS_OF_SERVICE_URL = "https://www.prismaolbackup.com/terms-of-service";
    public static final String REFUND_POLICY_URL = "https://www.prismaolbackup.com/refund-policy";

    // Directories
    public static final String REPORT_DIR_NAME = COMPANY_NAME + java.io.File.separator + TOOL_NAME;
    public static final String SETTINGS_DB_DIR = (COMPANY_NAME + java.io.File.separator + TOOL_NAME).replace(" ", "-");
    public static final String HIDDEN_SETTINGS_DB_DIR = "."
            + (COMPANY_NAME + "-" + TOOL_NAME).toLowerCase().replace(" ", "-").replace("/", "-").replace("\\", "-");

    // License Key Validation Pattern
    public static final String LICENSE_KEY_PATTERN =
        "^(AOL|AOL-ELITE|AOL-STANDARD|AOL-BUSINESS|PRISM-AOL)-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}$|^AOL-[A-Z0-9]+-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{4}$";
    public static final String LICENSE_KEY_FORMAT_HINT = "PRISM-AOL-XXXX-XXXX-XXXX";

    // About Dialog Texts
    public static final String TAGLINE = "Backup & Export AOL Mail Safely to 17 Formats";
    public static final String ABOUT_TITLE = TOOL_NAME;
    public static final String ABOUT_DESCRIPTION = "Prism AOL Mail Backup Tool is a professional desktop application to connect to AOL Mail accounts and backup emails, folders, and attachments safely into 17 target formats.";

    // SMTP Configuration
    public static final String SMTP_HOST = "smtp.mailgun.org";
    public static final String SMTP_PORT = "587";
    public static final String SMTP_USER = "postmaster@mg.prismaolbackup.com";
    public static final String SMTP_PASSWORD = System.getenv("SMTP_PASSWORD") != null
            ? System.getenv("SMTP_PASSWORD")
            : "mock_smtp_password_12345";
    public static final String COMPANY_EMAIL_SENDER = "notifications@prismaolbackup.com";
}
