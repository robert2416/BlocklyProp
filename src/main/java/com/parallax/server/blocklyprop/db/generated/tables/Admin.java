/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables;


import com.parallax.server.blocklyprop.db.generated.Blocklyprop;
import com.parallax.server.blocklyprop.db.generated.Keys;
import com.parallax.server.blocklyprop.db.generated.tables.records.AdminRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Admin extends TableImpl<AdminRecord> {

	private static final long serialVersionUID = -1119132640;

	/**
	 * The reference instance of <code>blocklyprop.admin</code>
	 */
	public static final Admin ADMIN = new Admin();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AdminRecord> getRecordType() {
		return AdminRecord.class;
	}

	/**
	 * The column <code>blocklyprop.admin.id</code>.
	 */
	public final TableField<AdminRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>blocklyprop.admin.db_version</code>.
	 */
	public final TableField<AdminRecord, Integer> DB_VERSION = createField("db_version", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>blocklyprop.admin.db_script</code>.
	 */
	public final TableField<AdminRecord, String> DB_SCRIPT = createField("db_script", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>blocklyprop.admin.notes</code>.
	 */
	public final TableField<AdminRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>blocklyprop.admin.last_change_date</code>.
	 */
	public final TableField<AdminRecord, Timestamp> LAST_CHANGE_DATE = createField("last_change_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>blocklyprop.admin</code> table reference
	 */
	public Admin() {
		this("admin", null);
	}

	/**
	 * Create an aliased <code>blocklyprop.admin</code> table reference
	 */
	public Admin(String alias) {
		this(alias, ADMIN);
	}

	private Admin(String alias, Table<AdminRecord> aliased) {
		this(alias, aliased, null);
	}

	private Admin(String alias, Table<AdminRecord> aliased, Field<?>[] parameters) {
		super(alias, Blocklyprop.BLOCKLYPROP, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<AdminRecord, Long> getIdentity() {
		return Keys.IDENTITY_ADMIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AdminRecord> getPrimaryKey() {
		return Keys.KEY_ADMIN_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AdminRecord>> getKeys() {
		return Arrays.<UniqueKey<AdminRecord>>asList(Keys.KEY_ADMIN_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Admin as(String alias) {
		return new Admin(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Admin rename(String name) {
		return new Admin(name, null);
	}
}