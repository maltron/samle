echo ">>> Step #1: Creating database on MySQL (You might need to enter your password)"
mysql -p < samle-database.sql
echo ">>> Step #2: Creating a datasource on WildFly (Be sure WildFly is running)"
jboss-cli.sh -c --commands="/subsystem=datasources/data-source=SamleDS:add(driver-name=MYSQL, jndi-name=java:/jboss/datasources/SamleDS,connection-url=jdbc:mysql://localhost:3306/SAMLE, user-name=mauricio, password=maltron),:reload"
