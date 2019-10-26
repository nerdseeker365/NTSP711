package com.nt.dto;

import lombok.Data;

@Data
public class EmployeeResultDTO extends EmployeeDTO {
	private int srNo;
	private int deptNo;
	private int mgr;

}
