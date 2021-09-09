package kr.hs.maejeom.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import kr.hs.maejeom.model.dto.CustomerDTO;

public interface CustomerDAO {
	public void signup(CustomerDTO dto); // ȸ������
	public boolean login(String userid, String passwd); // �α���
	public boolean duplicate(String email); // ���̵� �ߺ� Ȯ��
	public CustomerDTO read(String userid); // ȸ�� ���� �б�
	public void delete(String userid); // ȸ�� ����
	public void update(CustomerDTO dto); // ȸ�� ���� ����
}