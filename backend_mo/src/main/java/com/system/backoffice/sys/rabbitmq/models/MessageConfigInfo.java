package com.system.backoffice.sys.rabbitmq.models;

import java.io.Serializable;
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
public class MessageConfigInfo  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String msgSeq;
	private String msgSection;
	private String msgExplatation;
	private String msgGubun;
	private String msgUrl;
	private String msgIdExistsGubun;
	private String msgReturnType;
	private String msgSendGubun;
	private String msgEtc1;
	private String msgEtc2;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	private String msgReturnExample;
	private String exchangeRoutingKey;
	private String exchangeName;
}
