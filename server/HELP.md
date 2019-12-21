# Getting Started

## Настройка запуска 
bootstrap.properties 

spring.cloud.config.server.git.uri= file://${user.home}/Projects/Learning/SpringBootClouds/ConfigServerSamle
------------------------
последовательность
при старте выполнится загрузка с гит репозитария 

при подключении клиента 
должен быть гит репозитарий иначе 
java.lang.IllegalStateException: No .git at file:///home/evgeniyskiba/Projects/Learning/SpringBootClouds/ConfigServerSamle

для того чтобы данные подтянулись нужен хотя бы один коммит 
иначе  Could not merge remote for master remote: null



bootstrap.properties 
http://localhost:8888/client-config/development
http://localhost:8888/client-config/production


step 1 for this sample 

```
$ cd $HOME
$ mkdir config-repo
$ cd config-repo
$ git init .
$ echo info.foo: bar > application.properties
$ git add -A .
$ git commit -m "Add application.properties"
```

----------------------------------------------
##Actuator
### Base 
curl http://localhost:8888/log

### /loggers Actuator endpoint
```curl http://localhost:8888/actuator/loggers/com.baeldung.spring.boot.management.logging```

результат 
  {"configuredLevel":null,"effectiveLevel":"INFO"}
  
### изменить уровень логгирования 

```
curl -i -X POST -H 'Content-Type: application/json' -d '{"configuredLevel": "TRACE"}'  http://localhost:8888/actuator/loggers/com.se.sample.server.logging

```

### проверить уровень логгирования 
``` curl http://localhost:8888/actuator/loggers/com.se.sample.server.logging ```