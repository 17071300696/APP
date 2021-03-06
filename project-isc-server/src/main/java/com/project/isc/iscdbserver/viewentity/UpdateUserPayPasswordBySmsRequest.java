package com.project.isc.iscdbserver.viewentity;

import org.hibernate.validator.constraints.NotBlank;

/**
 * @description:接收更新用户密码post请求参数
 *
 */
public class UpdateUserPayPasswordBySmsRequest {
	@NotBlank(message = "手机号不能为空!")
	private String phone;
	@NotBlank(message = "验证码不能为空!")
	private String smsCode;
	@NotBlank(message = "密码不能为空!")
	private String payPassword;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSmsCode() {
		return smsCode;
	}

	public void setSmsCode(String smsCode) {
		this.smsCode = smsCode;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
}
