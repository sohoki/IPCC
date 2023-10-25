package com.system.ipcc.pbx.avaya.models;

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
public class TrankStatus {

	private String member;
	private String port;
	private String serviceState;
	private String mtceBusy;
	private String connectedPorts;

}
