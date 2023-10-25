package com.system.ipcc.pbx.avaya.models;


import java.util.List;

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
public class TrankGroupInfo {

	private String groupNumber;
	private String totalAdministeredMembers;
	private String groupType;
	private String groupName;
	private String tn;
	private String cor;
	private String cos;
	private List<TrankStatus> status;
}
