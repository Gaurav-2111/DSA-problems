SELECT
    id,
    MAX(CASE WHEN month = 'jan' THEN revenue END) AS Jan_Revenue,
    MAX(CASE WHEN month = 'feb' THEN revenue END) AS Feb_Revenue,
    MAX(CASE WHEN month = 'mar' THEN revenue END) AS Mar_Revenue,
    MAX(CASE WHEN month = 'apr' THEN revenue END) AS Apr_Revenue,
    MAX(CASE WHEN month = 'may' THEN revenue END) AS May_Revenue,
    MAX(CASE WHEN month = 'jun' THEN revenue END) AS Jun_Revenue,
    MAX(CASE WHEN month = 'jul' THEN revenue END) AS Jul_Revenue,
    MAX(CASE WHEN month = 'aug' THEN revenue END) AS Aug_Revenue,
    MAX(CASE WHEN month = 'sep' THEN revenue END) AS Sep_Revenue,
    MAX(CASE WHEN month = 'oct' THEN revenue END) AS Oct_Revenue,
    MAX(CASE WHEN month = 'nov' THEN revenue END) AS Nov_Revenue,
    MAX(CASE WHEN month = 'dec' THEN revenue END) AS Dec_Revenue
FROM Department
GROUP BY id;