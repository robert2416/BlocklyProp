/**
 * This class is generated by jOOQ
 */
package com.parallax.server.blocklyprop.db.generated.tables.records;


import com.parallax.server.blocklyprop.db.generated.tables.FriendRequest;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FriendRequestRecord extends UpdatableRecordImpl<FriendRequestRecord> implements Record7<Long, Long, Long, Timestamp, Integer, Timestamp, Boolean> {

	private static final long serialVersionUID = -157275520;

	/**
	 * Setter for <code>blocklyprop.friend_request.id</code>.
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.id</code>.
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>blocklyprop.friend_request.idRequestUser</code>.
	 */
	public void setIdrequestuser(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.idRequestUser</code>.
	 */
	public Long getIdrequestuser() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>blocklyprop.friend_request.idRequestedUser</code>.
	 */
	public void setIdrequesteduser(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.idRequestedUser</code>.
	 */
	public Long getIdrequesteduser() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>blocklyprop.friend_request.requested</code>.
	 */
	public void setRequested(Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.requested</code>.
	 */
	public Timestamp getRequested() {
		return (Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>blocklyprop.friend_request.request_sent_count</code>.
	 */
	public void setRequestSentCount(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.request_sent_count</code>.
	 */
	public Integer getRequestSentCount() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>blocklyprop.friend_request.request_last_sent</code>.
	 */
	public void setRequestLastSent(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.request_last_sent</code>.
	 */
	public Timestamp getRequestLastSent() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>blocklyprop.friend_request.refused</code>.
	 */
	public void setRefused(Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>blocklyprop.friend_request.refused</code>.
	 */
	public Boolean getRefused() {
		return (Boolean) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, Long, Long, Timestamp, Integer, Timestamp, Boolean> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Long, Long, Long, Timestamp, Integer, Timestamp, Boolean> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return FriendRequest.FRIEND_REQUEST.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return FriendRequest.FRIEND_REQUEST.IDREQUESTUSER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return FriendRequest.FRIEND_REQUEST.IDREQUESTEDUSER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field4() {
		return FriendRequest.FRIEND_REQUEST.REQUESTED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return FriendRequest.FRIEND_REQUEST.REQUEST_SENT_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return FriendRequest.FRIEND_REQUEST.REQUEST_LAST_SENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field7() {
		return FriendRequest.FRIEND_REQUEST.REFUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getIdrequestuser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getIdrequesteduser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value4() {
		return getRequested();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getRequestSentCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getRequestLastSent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value7() {
		return getRefused();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value2(Long value) {
		setIdrequestuser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value3(Long value) {
		setIdrequesteduser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value4(Timestamp value) {
		setRequested(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value5(Integer value) {
		setRequestSentCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value6(Timestamp value) {
		setRequestLastSent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord value7(Boolean value) {
		setRefused(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FriendRequestRecord values(Long value1, Long value2, Long value3, Timestamp value4, Integer value5, Timestamp value6, Boolean value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FriendRequestRecord
	 */
	public FriendRequestRecord() {
		super(FriendRequest.FRIEND_REQUEST);
	}

	/**
	 * Create a detached, initialised FriendRequestRecord
	 */
	public FriendRequestRecord(Long id, Long idrequestuser, Long idrequesteduser, Timestamp requested, Integer requestSentCount, Timestamp requestLastSent, Boolean refused) {
		super(FriendRequest.FRIEND_REQUEST);

		setValue(0, id);
		setValue(1, idrequestuser);
		setValue(2, idrequesteduser);
		setValue(3, requested);
		setValue(4, requestSentCount);
		setValue(5, requestLastSent);
		setValue(6, refused);
	}
}
