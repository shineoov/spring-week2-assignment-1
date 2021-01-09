# ToDo REST API 만들기

## 과제 목표

https://user-images.githubusercontent.com/14071105/104095825-535fc480-52dc-11eb-81b5-762b566b34d8.mov

Spring Web 이용해서 ToDo REST API를 만들어봅니다.

- ToDo 목록 얻기 - `GET /tasks`
- ToDo 상세 조회하기 - `GET /tasks/{id}`
- ToDo 생성하기 - `POST /tasks`
- ToDo 제목 수정하기 - `PUT/PATCH /tasks/{id}`
- ToDo 삭제하기 - `DELETE /tasks/{id}`

## 요구 사항

- 모든 API 테스트를 통과해야 합니다.
- 모든 E2E 테스트를 통과해야 합니다.

## 실행하기

```bash
./gradlew run
```

## 테스트

### 설치하기

```bash
$ cd tests
$ npm run test
```

### API 테스트 실행하기

테스트는 실제로 동작하는 서버에 테스트하므로 서버가 동작하고 있는 상태여야 올바르게 동작합니다.

```bash
$ npm run test
```

### E2E 테스트 실행하기

테스트는 실제로 동작하는 서버에 테스트하므로 서버가 동작하고 있는 상태여야 올바르게 동작합니다.  
프론트엔드 개발용 서버도 동작하고 있는 상태여야 올바르게 동작합니다.

```bash
$ npm run e2e
```


