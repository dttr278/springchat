package com.dttr.tchat.entities;
// Generated Jan 28, 2019 12:43:14 PM by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserHasMessage generated by hbm2java
 */
@Entity
@Table(name = "user_has_message")
public class UserHasMessage implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private UserHasMessageId id;
	private Message message;
	private Userinfo userinfo;
	private Date seentime;

	public UserHasMessage() {
	}

	public UserHasMessage(UserHasMessageId id, Message message, Userinfo userinfo) {
		this.id = id;
		this.message = message;
		this.userinfo = userinfo;
	}

	public UserHasMessage(UserHasMessageId id, Message message, Userinfo userinfo, Date seentime) {
		this.id = id;
		this.message = message;
		this.userinfo = userinfo;
		this.seentime = seentime;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "messid", column = @Column(name = "messid", nullable = false)),
			@AttributeOverride(name = "userid", column = @Column(name = "userid", nullable = false)) })
	public UserHasMessageId getId() {
		return this.id;
	}

	public void setId(UserHasMessageId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "messid", nullable = false, insertable = false, updatable = false)
	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false, insertable = false, updatable = false)
	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "seentime", length = 19)
	public Date getSeentime() {
		return this.seentime;
	}

	public void setSeentime(Date seentime) {
		this.seentime = seentime;
	}

}
