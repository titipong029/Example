package exam.main;

import exam.base.Group;
import exam.base.Loggable;
import exam.base.OrgUnit;
import exam.unit.Department;
import exam.unit.School;
import exam.unit.Staff;

public class MainOrgTest {
    public static void main(String[] args) {
//        testSchool();
//        testDepartment();
//        testSchoolAsOrgUnit();
//        testDepartmentAsLoggable();
//        testStaff();
        testDepartmentGroup();
    }



    private static void testSchool() {
        School s = new School(1,"KMUTT");
        System.out.println("getCode : " + s.getCode());
        System.out.println("getName : " + s.getName());
        s.setName("SIT");
        System.out.println("AfterSetName : " + s.getName());
        System.out.println("getLog : " + s.getLog());
        s.clearLog();
        System.out.println("AfterClearLog : " + s.getLog());

        System.out.println("getBalance:" + s.getBalance());
        s.earn(10000D);
        System.out.println("AfterEarn getBalance:" + s.getBalance());
        System.out.println("AfterEarn getLog : " + s.getLog());

        s.spend(5000D);
        System.out.println("AfterSpend getBalance:" + s.getBalance());
        System.out.println("AfterSpend getLog : " + s.getLog());
    }
    private static void testDepartment() {
        School school = new School(111,"SKB School");
        Department d = new Department(1,"SKB", school );
        System.out.println("getCode : " + d.getCode());
        System.out.println("getName : " + d.getName());
        d.setName("SKB111");
        System.out.println("AfterSetName : " + d.getName());
        System.out.println("getLog : " + d.getLog());
        d.clearLog();
        System.out.println("AfterClearLog : " + d.getLog());

        System.out.println("getSchool :" + d.getSchool().getName());
        School newSchool = new School(100 , "Sukkhabot School");
        d.setSchool(newSchool);
        System.out.println("After setSchool getSchool:" + d.getSchool().getName());
        System.out.println("After setSchool getLog:" + d.getLog());
    }
    private static void testSchoolAsOrgUnit() {
        School s = new School(1,"Sukkhabot School");
        System.out.println("getCode : " + s.getCode());
        System.out.println("getName : " + s.getName());
        s.setName("SIT");
        System.out.println("AfterSetName : " + s.getName());
        System.out.println("getLog : " + s.getLog());
        s.clearLog();
        System.out.println("AfterClearLog : " + s.getLog());

        System.out.println("getBalance:" + s.getBalance());
        s.earn(10000D);
        System.out.println("AfterEarn getBalance:" + s.getBalance());
        System.out.println("AfterEarn getLog : " + s.getLog());

        OrgUnit o = s;
        System.out.println("getCode : " + o.getCode());
        System.out.println("getName : " + o.getName());
        o.setName("SIT");
        System.out.println("AfterSetName : " + o.getName());
        System.out.println("getLog : " + o.getLog());
        o.clearLog();
        System.out.println("AfterClearLog : " + o.getLog());

        System.out.println("getBalance:" + ((School) o).getBalance());

        ((School) o).earn(10000D);
        System.out.println("AfterEarn getBalance:" + ((School) o).getBalance());
        System.out.println("AfterEarn getLog : " + o.getLog());;

        ((School) o).spend(5000D);
        System.out.println("AfterSpend getBalance:" + ((School) o).getBalance());
        System.out.println("AfterSpend getLog : " + o.getLog());
    }
    private static void testDepartmentAsLoggable() {
        School school = new School(111,"SKB School");
        Department d = new Department(1,"SKB", school );
        System.out.println("getCode : " + d.getCode());
        System.out.println("getName : " + d.getName());
        d.setName("SKB111");
        System.out.println("AfterSetName : " + d.getName());
        System.out.println("getLog : " + d.getLog());
        d.clearLog();
        System.out.println("AfterClearLog : " + d.getLog());

        System.out.println("getSchool :" + d.getSchool().getName());
        School newSchool = new School(100 , "Sukkhabot School");
        d.setSchool(newSchool);
        System.out.println("After setSchool getSchool:" + d.getSchool().getName());
        System.out.println("After setSchool getLog:" + d.getLog());

        Loggable l = d;
        System.out.println("getLog : " + l.getLog());
        l.clearLog();
        System.out.println("After clearLog getLog : " + l.getLog());
    }

    private static void testStaff() {
        Staff s = new Staff(1,"Jimmy","White",new School(100, "Sukkhabot School"));

        System.out.println("getId:" + s.getId());
        s.setId(123);
        System.out.println("After setId getId:" + s.getId());

        System.out.println("getFirstname:" + s.getFirstname());
        s.setFirstname("Mhom");
        System.out.println("After setFirstname getFirstname:" + s.getFirstname());

        System.out.println("getLastname:" + s.getLastname());
        s.setLastname("Gageenang");
        System.out.println("After setLastname getLastname:" + s.getLastname());

        System.out.println("getAff:" + s.getAffiliation().getName());
        s.setAffiliation(new Department(111,"Mumu", new School(100, "Sukkhabot School")));
        System.out.println("After setAffiliation getAff:" + s.getAffiliation().getName());
    }

    private static void testDepartmentGroup() {
        Group<Department> g = new Group<>(10);
        Department d1 = new Department(1,"K1", new School(1,"s-1"));
        Department d2 = new Department(2,"K2", new School(2,"s-2"));
        Department d3 = new Department(3,"K3", new School(3,"s-3"));
        Department d4 = new Department(4,"K4", new School(4,"s-4"));
        Department d5 = new Department(5,"K5", new School(5,"s-5"));

        System.out.println("Append d1:" + g.append(d1));
        System.out.println("Append d1:" + g.append(d1));
        System.out.println("Append d2:" + g.append(d2));
        System.out.println("Append d3:" + g.append(d3));
        System.out.println("Append d4:" + g.append(d4));
        System.out.println("Append d5:" + g.append(d5));

        System.out.println(g.find(d2));

    }

}
