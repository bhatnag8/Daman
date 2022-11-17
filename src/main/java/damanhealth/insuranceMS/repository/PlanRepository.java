package damanhealth.insuranceMS.repository;

import damanhealth.insuranceMS.entity.Benefit;
import damanhealth.insuranceMS.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}