package demo;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ProertiesDemo {

	public static void main(String[] args) {
		Set<Object> states;
		String str;
		Properties captials = new Properties();
		captials.put("�й� ","����");
		captials.put("Ī˹��","Ī˹��");
		captials.put("�ձ�","����");
		captials.put("����","����");
		captials.put("Ӣ��","�׶�");
	
		states = captials.keySet();	// ����һ������Set����
		Iterator<Object> itr = states.iterator();
		while(itr.hasNext()){
			str = (String)itr.next();
			System.out.println("���ң�" + str + "���׶���" + captials.get(str));
		}
		System.out.println();
		
		// ���"����"�ü������ڣ��򷵻�Ĭ��ֵ
		str = captials.getProperty("����","û�з���");
		System.out.println("�������׶���" + str);
	}
	
}
