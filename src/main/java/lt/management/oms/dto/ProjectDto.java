package lt.management.oms.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lt.management.oms.enums.Status;
import lt.management.oms.model.Address;
import lt.management.oms.model.Project;

@Data
@Setter
@Getter
public class ProjectDto {

    private String name;
    private Status status;
    private double budget;
    private Address address;
    private LocalDate deadline;

    public Project build() {
        Project project = new Project();
        project.setName(name);
        project.setStatus(status);
        project.setBudget(budget);
        project.setAddress(address);
        project.setDeadline(deadline);
        project.setUpdateDate(LocalDate.now());
        project.setCreateDate(LocalDate.now());
        return project;


    }

    public Project build(Project projectToDto) {
        Project project = new Project();
        project.setName(name);
        project.setStatus(status);
        project.setBudget(budget);
        project.setAddress(address);
        project.setDeadline(deadline);
        project.setUpdateDate(LocalDate.now());
        project.setCreateDate(LocalDate.now());
        return project;


    }

    public List<Project> entityToDto(List<Project> projectList) {

        return projectList.stream().map(x -> build(x)).collect(Collectors.toList());
    }

}
