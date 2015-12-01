package database_ex;

public class sqlmoon {
	SQL> conn /as sysdba;
	연결되었습니다.
	SQL> alter user hr identified by hr;

	사용자가 변경되었습니다.

	SQL> alter user hr identified by hr account unlock;

	사용자가 변경되었습니다.

	SQL> conn /as hr;
	SP2-0306: 부적당한 옵션입니다.
	사용법: CONN[ECT] [로그온] [AS {SYSDBA|SYSOPER}]
	where <logon>  ::= <username>[/<password>][@<connect_identifier>] | /
	SQL> conn hr/hr;
}
