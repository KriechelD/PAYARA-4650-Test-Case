# PAYARA-4650-Test-Case
At first, download Payara 5.201

1. Build the project by using the POM (mvn clean package).
2. Start up Payara 5.183 with "start-domain" (base config, no changes required)
3. Deploy the resulting .war from Step 1 on the Server
4. Build and deploy application `asadmin deploy project.war`
5. Check entries in h2 EJB__TIMER__TBL Table -> Shows one entry
6. Redeploy application `asadmin redeploy project.war`
7. Check entries in h2 EJB__TIMER__TBL Table -> Shows one entry
8. Redeploy application `asadmin redeploy project.war`
9. Check entries in h2 EJB__TIMER__TBL Table -> Shows two entries, should be one.
10. Check {domain}/logs/server.log. Scheduler outputs twice every minute.
11. Undeploy application `asadmin undeploy project`
12. Deploy application `asadmin deploy project.war`
13. Check entries in h2 EJB__TIMER__TBL Table -> Shows three entries, should be one.

Redeploy will now everytime create an additional Scheduler.
