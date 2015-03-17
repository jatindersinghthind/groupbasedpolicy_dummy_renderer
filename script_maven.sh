cd groupbasedpolicy/
mvn install -DskipTests -Dcheckstyle.skip=true -Dmaven.test.skip=true -nsu
sed -i 's@<feature>odl-groupbasedpolicy-ofoverlay</feature>@<!--feature>odl-groupbasedpolicy-ofoverlay</feature-->@g' distribution-karaf/pom.xml
sed -i 's@#org.ops4j.pax.url.mvn.settings=@org.ops4j.pax.url.mvn.settings=/etc/maven/settings.xml@g' distribution-karaf/target/assembly/etc/org.ops4j.pax.url.mvn.cfg
sed -i 's@# org.ops4j.pax.url.mvn.proxySupport=false@org.ops4j.pax.url.mvn.proxySupport=true@g' distribution-karaf/target/assembly/etc/org.ops4j.pax.url.mvn.cfg
cd distribution-karaf/target/assembly/bin/
./karaf
