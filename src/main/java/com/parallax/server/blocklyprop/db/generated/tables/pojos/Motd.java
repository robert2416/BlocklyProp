/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Customer-facing alerts
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Motd implements Serializable {

	private static final long serialVersionUID = 721941299;

	private Long      id;
	private String    messageText;
	private String    messageHtml;
	private String    notes;
	private Byte      enabled;
	private Byte      isDeleted;
	private Timestamp enableDatetime;
	private Timestamp disableDatetime;
	private Timestamp createDate;
	private Timestamp lastChangeDate;

	public Motd() {}

	public Motd(Motd value) {
		this.id = value.id;
		this.messageText = value.messageText;
		this.messageHtml = value.messageHtml;
		this.notes = value.notes;
		this.enabled = value.enabled;
		this.isDeleted = value.isDeleted;
		this.enableDatetime = value.enableDatetime;
		this.disableDatetime = value.disableDatetime;
		this.createDate = value.createDate;
		this.lastChangeDate = value.lastChangeDate;
	}

	public Motd(
		Long      id,
		String    messageText,
		String    messageHtml,
		String    notes,
		Byte      enabled,
		Byte      isDeleted,
		Timestamp enableDatetime,
		Timestamp disableDatetime,
		Timestamp createDate,
		Timestamp lastChangeDate
	) {
		this.id = id;
		this.messageText = messageText;
		this.messageHtml = messageHtml;
		this.notes = notes;
		this.enabled = enabled;
		this.isDeleted = isDeleted;
		this.enableDatetime = enableDatetime;
		this.disableDatetime = disableDatetime;
		this.createDate = createDate;
		this.lastChangeDate = lastChangeDate;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageText() {
		return this.messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getMessageHtml() {
		return this.messageHtml;
	}

	public void setMessageHtml(String messageHtml) {
		this.messageHtml = messageHtml;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Byte getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}

	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Timestamp getEnableDatetime() {
		return this.enableDatetime;
	}

	public void setEnableDatetime(Timestamp enableDatetime) {
		this.enableDatetime = enableDatetime;
	}

	public Timestamp getDisableDatetime() {
		return this.disableDatetime;
	}

	public void setDisableDatetime(Timestamp disableDatetime) {
		this.disableDatetime = disableDatetime;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getLastChangeDate() {
		return this.lastChangeDate;
	}

	public void setLastChangeDate(Timestamp lastChangeDate) {
		this.lastChangeDate = lastChangeDate;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Motd (");

		sb.append(id);
		sb.append(", ").append(messageText);
		sb.append(", ").append(messageHtml);
		sb.append(", ").append(notes);
		sb.append(", ").append(enabled);
		sb.append(", ").append(isDeleted);
		sb.append(", ").append(enableDatetime);
		sb.append(", ").append(disableDatetime);
		sb.append(", ").append(createDate);
		sb.append(", ").append(lastChangeDate);

		sb.append(")");
		return sb.toString();
	}
}