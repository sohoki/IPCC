package com.system.backoffice.uat.uia.event;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Builder
@ToString
@EqualsAndHashCode
public class AdminInfoManageEvent {

	private final String AdminId;
	private final String eventInfo;
	private final String AdiminChangeEventId; 
}
