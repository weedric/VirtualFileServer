package models;

import exceptions.UserException;

import static constants.UserConstants.*;

public class User {
    private String gva_email;
    private String gva_password;
    private boolean gva_isAdmin;
    private int gva_userId;
    private int gva_adminId;

    public User(String iva_email, String iva_password, boolean iva_isAdmin, int iva_userId, int iva_adminId) {
        if (iva_email.equals("")) {
            throw new UserException(GC_INVALID_EMAIL);
        }

        if (iva_password.equals("")) {
            throw new UserException(GC_INVALID_PASSWORD);
        }

        if (iva_userId < 0) {
            throw new UserException(GC_INVALID_ID);
        }

        if (iva_isAdmin) {
            if (iva_adminId < 0) {
                throw new UserException(GC_INVALID_ID);
            }
            this.gva_adminId = iva_adminId;
        }

        this.gva_email = iva_email;
        this.gva_password = iva_password;
        this.gva_userId = iva_userId;
        this.gva_adminId = iva_adminId;
    }

    public void setEmail(String iva_email) {
        if (iva_email.equals("")) {
            throw new UserException(GC_INVALID_EMAIL);
        }

        this.gva_email = iva_email;
    }

    public void setPassword(String iva_password) {
        if (iva_password.equals("")) {
            throw new UserException(GC_INVALID_PASSWORD);
        }

        this.gva_password = iva_password;
    }

    public void setIsAdmin(boolean iva_isAdmin) {
        this.gva_isAdmin = iva_isAdmin;
    }

    public void setUserId(int iva_userId) {
        if (iva_userId < 0) {
            throw new UserException(GC_INVALID_ID);
        }

        this.gva_userId = iva_userId;
    }

    public void setAdminId(int iva_adminId) {
        if (gva_isAdmin) {
            if (iva_adminId < 0) {
                throw new UserException(GC_INVALID_ID);
            }
            this.gva_adminId = iva_adminId;
        }
    }

    public String getEmail() {
        return this.gva_email;
    }

    public String getPassword() {
        return this.gva_password;
    }

    public boolean getIsAdmin() {
        return this.gva_isAdmin;
    }

    public int getUserId() {
        return this.gva_userId;
    }

    public int getAdminId() {
        return this.gva_adminId;
    }
}
