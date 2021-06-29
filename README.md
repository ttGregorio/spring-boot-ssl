Este projeto tem como objetivo exemplificar como segurar uma api spring boot com um certificado p12

Para gerar um certificado utilize o seguinte comando
keytool -genkeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore <nome do seu certificado>.p12 -validity 365

neste exemplo, 
keytool -genkeypair -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore api-certificate.p12 -validity 365

Para importar o certificado no postman acesse settings -> certificates -> import

Para importar no chrome acesse configurações -> Segurança -> Gerenciar certificados
