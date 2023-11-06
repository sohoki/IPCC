package com.system.backoffice.sym.voc.models;

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
public class VocProcessFileInfo {

	private String fileSeq;
	private String vocProcessSeq;
	private String vocProcessFile;
}
