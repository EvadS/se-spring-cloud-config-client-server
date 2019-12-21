# se-spring-cloud-config-client-server
Config Server и Config Client

## Technologies 

Config Server 
Config Client
SpringBoot Actuator 
Swagger 

Дополнительно 
Client properties in git repository
https://github.com/EvadS/se-spring-cloud-config-client-server-git-repo

## Demo
Build and Run Eureka server
Build and Run Config Server Project
Build and Run Config Client Project

###Test REST Endpoint
eureka 
http://localhost:8761/

server
http://localhost:8888/client-config/development 

<b>
апи /client-config будет сгенерино 
</b>

client 
http://localhost:8080/msg

если пропертисы поменялись 
http://localhost:8080/refresh

После успешного обновления службы клиента конфигурации новое значение должно быть отражено в ответе службы. Это потому, что @RefreshScope аннотирует оставшийся контроллер Control Rest.

http://localhost:8888/config-server-client/development

шаг 2 

<b>bootstrap.properties</b> Этот файл будет загружен до загрузки файла application.properties и до создания Java-бинов при запуске приложения.



