package com.ims.dao;
import java.util.List;
import com.ims.model.AutoPolicy;

public interface AutoPolicyDao {
void addPolicy();
List<AutoPolicy>viewAllPolicy();
AutoPolicy viewPolicy(int pid);
boolean deletePolicy(int pid);
int updatePolicy(int pid);

}
