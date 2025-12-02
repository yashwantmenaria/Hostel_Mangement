package com.example.hostel;

import java.time.LocalDate;

public class UserDetailsRequest {
	 private String firstName;
	    private String lastName;
	    private String email;
	    private Long mobile;
	    private String password;
	    private String registerNumber;
	    private String role; // "ADMIN" or "USER"
	  
	    private String Address;
	    private String dob;
	    private String bloodGroup;
	    private Long roomNo;
	    private Long securityDeposit;
	    private String adharCard;
	    private String profilePic;
	    private LocalDate joinDate;
	    private Boolean isActive = true;
	    private Boolean isDeleted = false;
	    private Long roomType;
	    private LocalDate exitDate;

	    private String guardianName;
	    private String guardianRelation;
	    private String guardianPhone;

	    private String profileImageUrl;
	    private String aadharImageUrl;
	    private String photoIdUrl;
	    
	    private Boolean messActive;
	    private String workOrClgName;
	    private String badNumber;
	    private String rentAmount;
	    private String securityAmount;
	    private String almiraNumber;
	    
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getMobile() {
			return mobile;
		}
		public void setMobile(Long mobile) {
			this.mobile = mobile;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRegisterNumber() {
			return registerNumber;
		}
		public void setRegisterNumber(String registerNumber) {
			this.registerNumber = registerNumber;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		public Long getRoomNo() {
			return roomNo;
		}
		public void setRoomNo(Long roomNo) {
			this.roomNo = roomNo;
		}
		public Long getSecurityDeposit() {
			return securityDeposit;
		}
		public void setSecurityDeposit(Long securityDeposit) {
			this.securityDeposit = securityDeposit;
		}
		public String getAdharCard() {
			return adharCard;
		}
		public void setAdharCard(String adharCard) {
			this.adharCard = adharCard;
		}
		public String getProfilePic() {
			return profilePic;
		}
		public void setProfilePic(String profilePic) {
			this.profilePic = profilePic;
		}
		public LocalDate getJoinDate() {
			return joinDate;
		}
		public void setJoinDate(LocalDate joinDate) {
			this.joinDate = joinDate;
		}
		public Boolean getIsActive() {
			return isActive;
		}
		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}
		public Boolean getIsDeleted() {
			return isDeleted;
		}
		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}
		public Long getRoomType() {
			return roomType;
		}
		public void setRoomType(Long roomType) {
			this.roomType = roomType;
		}
		public LocalDate getExitDate() {
			return exitDate;
		}
		public void setExitDate(LocalDate exitDate) {
			this.exitDate = exitDate;
		}
		public String getGuardianName() {
			return guardianName;
		}
		public void setGuardianName(String guardianName) {
			this.guardianName = guardianName;
		}
		public String getGuardianRelation() {
			return guardianRelation;
		}
		public void setGuardianRelation(String guardianRelation) {
			this.guardianRelation = guardianRelation;
		}
		public String getGuardianPhone() {
			return guardianPhone;
		}
		public void setGuardianPhone(String guardianPhone) {
			this.guardianPhone = guardianPhone;
		}
		public String getProfileImageUrl() {
			return profileImageUrl;
		}
		public void setProfileImageUrl(String profileImageUrl) {
			this.profileImageUrl = profileImageUrl;
		}
		public String getAadharImageUrl() {
			return aadharImageUrl;
		}
		public void setAadharImageUrl(String aadharImageUrl) {
			this.aadharImageUrl = aadharImageUrl;
		}
		public String getPhotoIdUrl() {
			return photoIdUrl;
		}
		public void setPhotoIdUrl(String photoIdUrl) {
			this.photoIdUrl = photoIdUrl;
		}
		public Boolean getMessActive() {
			return messActive;
		}
		public void setMessActive(Boolean messActive) {
			this.messActive = messActive;
		}
		public String getWorkOrClgName() {
			return workOrClgName;
		}
		public void setWorkOrClgName(String workOrClgName) {
			this.workOrClgName = workOrClgName;
		}
		public String getBadNumber() {
			return badNumber;
		}
		public void setBadNumber(String badNumber) {
			this.badNumber = badNumber;
		}
		public String getRentAmount() {
			return rentAmount;
		}
		public void setRentAmount(String rentAmount) {
			this.rentAmount = rentAmount;
		}
		public String getSecurityAmount() {
			return securityAmount;
		}
		public void setSecurityAmount(String securityAmount) {
			this.securityAmount = securityAmount;
		}
		public String getAlmiraNumber() {
			return almiraNumber;
		}
		public void setAlmiraNumber(String almiraNumber) {
			this.almiraNumber = almiraNumber;
		}
		@Override
		public String toString() {
			return "UserDetailsRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", mobile=" + mobile + ", password=" + password + ", registerNumber=" + registerNumber + ", role="
					+ role + ", Address=" + Address + ", dob=" + dob + ", bloodGroup=" + bloodGroup + ", roomNo="
					+ roomNo + ", securityDeposit=" + securityDeposit + ", adharCard=" + adharCard + ", profilePic="
					+ profilePic + ", joinDate=" + joinDate + ", isActive=" + isActive + ", isDeleted=" + isDeleted
					+ ", roomType=" + roomType + ", exitDate=" + exitDate + ", guardianName=" + guardianName
					+ ", guardianRelation=" + guardianRelation + ", guardianPhone=" + guardianPhone
					+ ", profileImageUrl=" + profileImageUrl + ", aadharImageUrl=" + aadharImageUrl + ", photoIdUrl="
					+ photoIdUrl + ", messActive=" + messActive + ", workOrClgName=" + workOrClgName + ", badNumber="
					+ badNumber + ", rentAmount=" + rentAmount + ", securityAmount=" + securityAmount
					+ ", almiraNumber=" + almiraNumber + ", getFirstName()=" + getFirstName() + ", getLastName()="
					+ getLastName() + ", getEmail()=" + getEmail() + ", getMobile()=" + getMobile() + ", getPassword()="
					+ getPassword() + ", getRegisterNumber()=" + getRegisterNumber() + ", getRole()=" + getRole()
					+ ", getAddress()=" + getAddress() + ", getDob()=" + getDob() + ", getBloodGroup()="
					+ getBloodGroup() + ", getRoomNo()=" + getRoomNo() + ", getSecurityDeposit()="
					+ getSecurityDeposit() + ", getAdharCard()=" + getAdharCard() + ", getProfilePic()="
					+ getProfilePic() + ", getJoinDate()=" + getJoinDate() + ", getIsActive()=" + getIsActive()
					+ ", getIsDeleted()=" + getIsDeleted() + ", getRoomType()=" + getRoomType() + ", getExitDate()="
					+ getExitDate() + ", getGuardianName()=" + getGuardianName() + ", getGuardianRelation()="
					+ getGuardianRelation() + ", getGuardianPhone()=" + getGuardianPhone() + ", getProfileImageUrl()="
					+ getProfileImageUrl() + ", getAadharImageUrl()=" + getAadharImageUrl() + ", getPhotoIdUrl()="
					+ getPhotoIdUrl() + ", getMessActive()=" + getMessActive() + ", getWorkOrClgName()="
					+ getWorkOrClgName() + ", getBadNumber()=" + getBadNumber() + ", getRentAmount()=" + getRentAmount()
					+ ", getSecurityAmount()=" + getSecurityAmount() + ", getAlmiraNumber()=" + getAlmiraNumber()
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	    
	    
			    
		
}
