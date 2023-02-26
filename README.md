# Kotlin + Webflux + R2DBC 예제

## 클린아키텍처를 적용한 심플한 예제

![](../../../../var/folders/6q/x7qnh9cn4kd_dkrwq8y_lym00000gn/T/TemporaryItems/NSIRD_screencaptureui_OuiaSd/스크린샷 2023-02-26 15.58.27.png)

## MySQL 설정

- h2 database 콘솔이 r2dbc에서는 지원이 안되서 docker 를 이용한 mysql을 띄위로 결정
- /local_env 에서 docker-compose 를 이용해 mysql8.0을 띄우면됩니다.


```text
예시)
docker-compose up -d
```


## DDL 생성

- src/main/resources/db/schema.sql 을 복사해서 테이블 미리 생성하기


## 어플리케이션 실행

- src/main/kotlin/com/example/moducoffee/ModucoffeeApplication.kt

## API 테스트

- testapi/postAPI.http 파일 참고


