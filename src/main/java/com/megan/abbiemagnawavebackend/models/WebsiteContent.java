package com.megan.abbiemagnawavebackend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "website_content")
public class WebsiteContent {

    @Id
    private String id;

    private String adminId; // The admin who owns/edited this content

    private LandingSection landingSection;
    private AboutSection aboutSection;
    private AppointmentSection appointmentSection;

    private ColorScheme colorScheme;

    private Date createdAt = new Date();
    private Date updatedAt = new Date();

    public WebsiteContent() {
        this.landingSection = new LandingSection();
        this.aboutSection = new AboutSection();
        this.appointmentSection = new AppointmentSection();
        this.colorScheme = new ColorScheme();
    }

    // Getters and setters for all fields below...

    // Nested classes

    public static class LandingSection {
        private String landingImageUrl;
        private String logoUrl;
        private String brandName;

        public LandingSection() {}

        public String getLandingImageUrl() {
            return landingImageUrl;
        }

        public void setLandingImageUrl(String landingImageUrl) {
            this.landingImageUrl = landingImageUrl;
        }

        public String getLogoUrl() {
            return logoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
        }

        public String getBrandName() {
            return brandName;
        }

        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }
    }

    public static class AboutSection {
        private String aboutTitle;
        private String aboutText;
        private String aboutImageUrl;

        public AboutSection() {}

        public String getAboutTitle() {
            return aboutTitle;
        }

        public void setAboutTitle(String aboutTitle) {
            this.aboutTitle = aboutTitle;
        }

        public String getAboutText() {
            return aboutText;
        }

        public void setAboutText(String aboutText) {
            this.aboutText = aboutText;
        }

        public String getAboutImageUrl() {
            return aboutImageUrl;
        }

        public void setAboutImageUrl(String aboutImageUrl) {
            this.aboutImageUrl = aboutImageUrl;
        }
    }

    public static class AppointmentSection {
        private String appointmentSectionTitle;
        private String appointmentSectionSubtext;

        public AppointmentSection() {}

        public String getAppointmentSectionTitle() {
            return appointmentSectionTitle;
        }

        public void setAppointmentSectionTitle(String appointmentSectionTitle) {
            this.appointmentSectionTitle = appointmentSectionTitle;
        }

        public String getAppointmentSectionSubtext() {
            return appointmentSectionSubtext;
        }

        public void setAppointmentSectionSubtext(String appointmentSectionSubtext) {
            this.appointmentSectionSubtext = appointmentSectionSubtext;
        }
    }

    public static class ColorScheme {
        private String backgroundColorHex;
        private String textColorHex;
        private String primaryColorHex;
        private String secondaryColorHex;
        private String accentColorHex;

        public ColorScheme() {}

        public String getBackgroundColorHex() {
            return backgroundColorHex;
        }

        public void setBackgroundColorHex(String backgroundColorHex) {
            this.backgroundColorHex = backgroundColorHex;
        }

        public String getTextColorHex() {
            return textColorHex;
        }

        public void setTextColorHex(String textColorHex) {
            this.textColorHex = textColorHex;
        }

        public String getPrimaryColorHex() {
            return primaryColorHex;
        }

        public void setPrimaryColorHex(String primaryColorHex) {
            this.primaryColorHex = primaryColorHex;
        }

        public String getSecondaryColorHex() {
            return secondaryColorHex;
        }

        public void setSecondaryColorHex(String secondaryColorHex) {
            this.secondaryColorHex = secondaryColorHex;
        }

        public String getAccentColorHex() {
            return accentColorHex;
        }

        public void setAccentColorHex(String accentColorHex) {
            this.accentColorHex = accentColorHex;
        }
    }

    // Getters and setters for main fields

    public String getId() {
        return id;
    }

    public void setId(String id) {
       this.id = id;
    }

    public String getAdminId() {
       return adminId;
    }

    public void setAdminId(String adminId) {
       this.adminId = adminId;
    }

    public LandingSection getLandingSection() {
       return landingSection;
    }

    public void setLandingSection(LandingSection landingSection) {
       this.landingSection = landingSection;
    }

    public AboutSection getAboutSection() {
       return aboutSection;
    }

    public void setAboutSection(AboutSection aboutSection) {
       this.aboutSection = aboutSection;
    }

    public AppointmentSection getAppointmentSection() {
       return appointmentSection;
    }

    public void setAppointmentSection(AppointmentSection appointmentSection) {
       this.appointmentSection = appointmentSection;
    }

    public ColorScheme getColorScheme() {
       return colorScheme;
    }

    public void setColorScheme(ColorScheme colorScheme) {
       this.colorScheme = colorScheme;
    }

    public Date getCreatedAt() {
       return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
       this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
       return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
       this.updatedAt = updatedAt;
    }
}
