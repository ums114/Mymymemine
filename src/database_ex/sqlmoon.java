package database_ex;

public class sqlmoon {
	SQL> conn /as sysdba;
	����Ǿ����ϴ�.
	SQL> alter user hr identified by hr;

	����ڰ� ����Ǿ����ϴ�.

	SQL> alter user hr identified by hr account unlock;

	����ڰ� ����Ǿ����ϴ�.

	SQL> conn /as hr;
	SP2-0306: �������� �ɼ��Դϴ�.
	����: CONN[ECT] [�α׿�] [AS {SYSDBA|SYSOPER}]
	where <logon>  ::= <username>[/<password>][@<connect_identifier>] | /
	SQL> conn hr/hr;
}
