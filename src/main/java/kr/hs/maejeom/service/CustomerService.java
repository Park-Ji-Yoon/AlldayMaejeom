package kr.hs.maejeom.service;

import java.util.List;

import kr.hs.maejeom.model.dto.CustomerDTO;

public interface CustomerService {
	public void signup(CustomerDTO dto); // ȸ������
	public boolean login(String userid, String passwd); // �α���
	public boolean duplicate(String userid); // ���̵� �ߺ� Ȯ��
	public CustomerDTO read(String userid); // ȸ�� ���� �б�
	public void delete(String userid); // ȸ�� ����
	public void update(CustomerDTO dto); // ȸ�� ���� ����
}
