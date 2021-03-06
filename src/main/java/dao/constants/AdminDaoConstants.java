package dao.constants;

import dao.enums.ColNameAdmin;
import dao.enums.TableName;

public abstract class AdminDaoConstants {
    public static final String GC_TABLE_ADMIN = TableName.Admin.getTableName();

    public static final String GC_COL_ADMIN_ID = ColNameAdmin.Id.getColName();
    public static final String GC_COL_ADMIN_USER_ID = ColNameAdmin.UserId.getColName();
}
