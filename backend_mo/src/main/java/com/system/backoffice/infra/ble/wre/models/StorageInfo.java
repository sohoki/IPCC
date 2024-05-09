package com.system.backoffice.infra.ble.wre.models;

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
public class StorageInfo  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String storageCode;
	private String centerId;
	private String storageName;
	private String storageDc;
	private String insttCode;
	private String storageUseyn;
	private String createDe;
	private String endDe;
	private String frstRegisterId;
	private String frstRegistPnttm;
	private String lastUpdusrId;
	private String lastUpdtPnttm;
	private String userId;

}
