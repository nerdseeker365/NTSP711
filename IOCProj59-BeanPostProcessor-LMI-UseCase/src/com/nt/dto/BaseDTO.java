package com.nt.dto;

import java.io.Serializable;

public abstract class BaseDTO implements Serializable{
        private String name;
        private String addrs;
        private String email;
        private  long mobileNo;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddrs() {
			return addrs;
		}
		public void setAddrs(String addrs) {
			this.addrs = addrs;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
}
