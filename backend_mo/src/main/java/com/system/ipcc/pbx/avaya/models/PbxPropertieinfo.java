package com.system.ipcc.pbx.avaya.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@ConfigurationProperties("pbx-info")
@ConstructorBinding
public class PbxPropertieinfo {

	private final String sms_root;
	private final String cm_id;
	private final String cm_password;
	private final String output_format;
	private final String output_objectname;
	private final String output_fields;
	private final String soap_format_xml;
}
