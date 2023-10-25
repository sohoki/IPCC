package com.system.ipcc.ivr.rapeech.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChannelOnline {

	private String channelNo;
	private String tenantId;
	private String centerCode;
	private String callUuid;
	private String status;
	private String delays;
	private String errors;
	private String aiAlarms;
	private String dialogs;
	private String updatedAt;
}
