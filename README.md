# ejemplo-de-microservicios

# Este ejemplo lo dejo como maqueta para proximos proyectos

# Configuracion basica de un microservicio:

###### spring.jpa.database=POSTGRESQL
###### spring.datasource.platform=postgres
###### spring.datasource.url=jdbc:postgresql://localhost:5432/producto
###### spring.datasource.username=postgres
###### spring.datasource.password=root
###### spring.jpa.show-sql=true
###### spring.jpa.generate-ddl=true
###### spring.jpa.hibernate.ddl-auto=create-drop
###### spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

###### spring.application.name=producto-microservice
###### server.port=0
###### eureka.instance.instance-id=${spring.application.name}:${random.uuid}

# Configuracion basica Servicor eureka 

###### server.port=8761
###### eureka.client.register-with-eureka=false
###### eureka.client.fetch-registry=false
###### eureka.server.enableSelfPreservation=false

## Dependencias
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
		</dependency>

# Configuracion basica API geteway

###### server.port=8090
###### spring.application.name = api-gateway
###### spring.cloud.gateway.discovery.locator.enabled=true
###### eureka.instance.instance-id=${spring.application.name}:${random.uuid}
###### spring.cloud.loadbalancer.ribbon.enabled=false
###### spring.cloud.gateway.routes[0].id=producto-microservice
###### spring.cloud.gateway.routes[0].uri=lb://PRODUCTO-MICROSERVICE
###### spring.cloud.gateway.routes[0].predicates[0]= Path=/producto/**
