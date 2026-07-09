-- Last updated: 7/9/2026, 10:07:12 AM
# Write your MySQL query statement below
SELECT 
    (
            SELECT DISTINCT salary
                    FROM Employee
                            ORDER BY salary DESC
                                    LIMIT 1 OFFSET 1
                                        ) AS SecondHighestSalary;