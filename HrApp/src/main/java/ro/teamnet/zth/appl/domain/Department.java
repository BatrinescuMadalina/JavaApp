package ro.teamnet.zth.appl.domain;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Join;
import ro.teamnet.zth.api.annotations.Table;
import ro.teamnet.zth.api.em.RelationType;

/**
 * Created by Diana.Diaconu on 4/21/2015.
 */
@Table(name = "departments")
public class Department {

    @Id(name = "department_id")
    private Integer id;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "location_id")
    @Join(refColName = "location_id", relationType = RelationType.MANYTOONE, tableRef = "locations")
    private Location locations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Location getLocations() {
        return locations;
    }

    public void setLocations(Location locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", locations=" + locations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Department that = (Department) o;

        if (!departmentName.equals(that.departmentName)) return false;
        if (!id.equals(that.id)) return false;

        return true;
    }
}
