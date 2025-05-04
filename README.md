


# ✨ Todo-Ddudo!  
> 함께 목표를 실천하는 협업형 To-do 플랫폼

---


![image](https://github.com/user-attachments/assets/bb7604bb-9069-482c-a233-37a47f0930e3)


---

## 📚 목차 (Table of Contents)

- [DDIS 팀 소개](#meet-the-ddis-team-members)  
- [기획 의도](#기획-의도)
- [Tech Stack](#tech-stack)  
- [주요 기능 소개](#주요-기능)  
- [UI/UX 설계](#uiux-설계)  
- [CI/CD 설계](#cicd-설계)  
- [팀원 회고](#팀원-회고)
- [설계문서](#설계-문서)

---


## Meet the **DDIS** Team Members

<table align="center">
  <tr>
    <td align="center"><img src="https://github.com/user-attachments/assets/c878ec33-a47f-4407-a037-2589a0fa5785" width="400"/><br/>이성준<br/><a href="https://github.com/1214alex">@1214alex</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/11111111?s=100"/><br/>강이도은<br/><a href="https://github.com/github-id1">@github-id1</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/22222222?s=100"/><br/>고도연<br/><a href="https://github.com/github-id2" width="400">@github-id2</a></td>
  </tr>
  <tr>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/33333333?s=100"/><br/>김기종<br/><a href="https://github.com/github-id3">@github-id3</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/44444444?s=100"/><br/>주아현<br/><a href="https://github.com/github-id4">@github-id4</a></td>
    <td align="center"><img src="https://avatars.githubusercontent.com/u/55555555?s=100"/><br/>한윤상<br/><a href="https://github.com/github-id5">@github-id5</a></td>
  </tr>
</table>

---

</center>

# 기획 의도

### 📌 프로젝트 목표

> **“혼자는 어려워도, 함께하면 지켜낼 수 있어요.”**  
Todo-Ddudo는 협업 기반의 To-do 실천을 통해  
**사용자의 꾸준한 습관 형성과 목표 달성**을 돕는 소셜 플랫폼입니다.

---

### 📌 서비스 개요

**Todo-Ddudu**는 사용자들이 **목표 달성을 위해 함께 To-do를 실천**할 수 있는  
**협업 기반의 소셜 플랫폼**입니다.  
공동 To-do 방, 인증 시스템, 통계 시각화, 커뮤니티 기능을 통해  
사용자의 꾸준한 실천을 돕는 동기부여형 서비스입니다.

---

### 📌 서비스 배경

- 🙇‍♀️ 혼자서는 지키기 어려운 계획  
- 💬 친구들과의 약속은 지켜내는 나  
- 📉 단순한 체크리스트 앱으로는 부족했던 피드백과 자극

> Todo-Ddudu는 ‘**함께하는 실천**’에 초점을 맞춘 To-do 플랫폼입니다.  
공동 목표 설정 → 인증 → 승인 → 통계 피드백까지!  
**실천을 위한 선순환 구조**를 제공합니다.

---

### 📌 서비스 설명

1. 회원가입 및 로그인 (소셜 로그인 포함)  
2. 모집 게시글로 공동 목표 멤버 모집  
3. 공동 To-do 방 자동 생성  
4. 인증 시스템(텍스트/이미지 + 피드백 기능)  
5. 달성률 및 피드백 통계 시각화  
6. 커뮤니티 신고/관리 시스템

---

# Tech Stack

> 프론트엔드(Vue.js)와 백엔드(Spring Boot)가 완전히 분리된 구조이며,  
> 실시간 채팅, 통계 시각화, JWT 인증, CI/CD 파이프라인 및 GitOps 배포까지 통합된 풀스택 프로젝트입니다.

***

### 🎨 Design & Modeling
![Figma](https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white)
![draw.io](https://img.shields.io/badge/draw.io-F08705?style=for-the-badge&logo=diagramsdotnet&logoColor=white)
![DA#](https://img.shields.io/badge/DA%23-ERD--Modeling-005CA9?style=for-the-badge)

***

### 🚀 Frontend
![Vue.js](https://img.shields.io/badge/Vue.js-3.x-35495E?style=for-the-badge&logo=vue.js&logoColor=4FC08D)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6+-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![Pinia](https://img.shields.io/badge/Pinia-State--Mgmt-ffe600?style=for-the-badge&logo=pinia&logoColor=black)
![Vue Router](https://img.shields.io/badge/Vue--Router-SPA-42B983?style=for-the-badge)
![Axios](https://img.shields.io/badge/Axios-REST--API-5A29E4?style=for-the-badge)
![v-calendar](https://img.shields.io/badge/V--Calendar-Date--Picker-42b883?style=for-the-badge)
![dayjs](https://img.shields.io/badge/Day.js-Date--Handling-ffb300?style=for-the-badge)
![vuedraggable](https://img.shields.io/badge/VueDraggable-Drag%20%26%20Drop-00c1d4?style=for-the-badge)
![Chart.js](https://img.shields.io/badge/Chart.js-Stats--Chart-FF6384?style=for-the-badge&logo=chartdotjs)
![ECharts](https://img.shields.io/badge/ECharts-Data--Viz-4A92E2?style=for-the-badge&logo=apacheecharts)
![Socket.IO](https://img.shields.io/badge/Socket.IO-Real--Time-000000?style=for-the-badge&logo=socket.io)
![STOMP.js](https://img.shields.io/badge/STOMP.js-Over--WebSocket-6e00ff?style=for-the-badge)
![Vite](https://img.shields.io/badge/Vite-Bundler-646CFF?style=for-the-badge&logo=vite&logoColor=white)

***

### ⚙️ Backend
![Java](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Auth-4CAF50?style=for-the-badge&logo=springsecurity)
![JWT](https://img.shields.io/badge/JJWT-Token--Auth-000000?style=for-the-badge&logo=jsonwebtokens)
![Spring WebSocket](https://img.shields.io/badge/Spring--WebSocket-Real--Time-6DB33F?style=for-the-badge)
![Freemarker](https://img.shields.io/badge/Freemarker-Template--Engine-1C7EBB?style=for-the-badge)
![WebJars](https://img.shields.io/badge/WebJars-Static--Assets-4B4B4B?style=for-the-badge)
![Gson](https://img.shields.io/badge/Gson-JSON--Parser-E64A19?style=for-the-badge)
![Spring Mail](https://img.shields.io/badge/Spring--Mail-Email--Auth-C80000?style=for-the-badge)
![Spring Validation](https://img.shields.io/badge/Spring--Validation-Form--Check-0d9488?style=for-the-badge)
![Spring Devtools](https://img.shields.io/badge/Spring--Devtools-Hot--Reload-FF5722?style=for-the-badge)

***

### 🧩 ORM & DB Frameworks
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-ORM-59666C?style=for-the-badge)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-59666C?style=for-the-badge&logo=hibernate)
![MyBatis](https://img.shields.io/badge/MyBatis-SQL--Mapper-3D2C00?style=for-the-badge)
![ModelMapper](https://img.shields.io/badge/ModelMapper-DTO--Mapper-0d9488?style=for-the-badge)

***

### 🗃 Database
![MariaDB](https://img.shields.io/badge/MariaDB-Relational--DB-003545?style=for-the-badge&logo=mariadb)
![Redis](https://img.shields.io/badge/Redis-Session--Cache-DC382D?style=for-the-badge&logo=redis)

***

### 🧪 Testing
![JUnit5](https://img.shields.io/badge/JUnit5-Unit--Test-25A162?style=for-the-badge&logo=junit5)
![Spring Boot Test](https://img.shields.io/badge/Spring--Boot--Test-Integration--Test-6DB33F?style=for-the-badge)
![MyBatis Test](https://img.shields.io/badge/MyBatis--Test-Mapper--Validation-FF6600?style=for-the-badge)
![Spring Security Test](https://img.shields.io/badge/Spring--Security--Test-Mock--Auth-43A047?style=for-the-badge)

***

### ⚙️ DevOps / CI/CD
![Jenkins](https://img.shields.io/badge/Jenkins-CI--Pipeline-D24939?style=for-the-badge&logo=jenkins)
![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED?style=for-the-badge&logo=docker)
![Kubernetes](https://img.shields.io/badge/Kubernetes-Orchestration-326CE5?style=for-the-badge&logo=kubernetes)
![Argo CD](https://img.shields.io/badge/ArgoCD-GitOps--Deploy-1976D2?style=for-the-badge&logo=argo)

***

### 🛠 Tools
![Git](https://img.shields.io/badge/Git-Version--Control-F05032?style=for-the-badge&logo=git)
![GitHub](https://img.shields.io/badge/GitHub-Repo--Hosting-181717?style=for-the-badge&logo=github)
![IntelliJ](https://img.shields.io/badge/IntelliJ--IDEA-Java--IDE-000000?style=for-the-badge&logo=intellijidea)
![VSCode](https://img.shields.io/badge/VS%20Code-Frontend--Dev-007ACC?style=for-the-badge&logo=visualstudiocode)
![Notion](https://img.shields.io/badge/Notion-Docs--&--WBS-000000?style=for-the-badge&logo=notion)

---

# 주요 기능

<details>
  <summary>회원가입</summary>

  #### 회원가입 화면
 ![회원가입](https://github.com/user-attachments/assets/2471a918-e3c4-4426-bfc3-ae09eab7ef68)

  #### 회원가입 이메일 인증 화면
![회원가입_이메일인증](https://github.com/user-attachments/assets/401e5996-2465-4f55-a416-a8c82a80924a)

</details>

<details>
  <summary>메인 페이지</summary>

  #### 메인 페이지 
  ![메인페이지](https://github.com/user-attachments/assets/2b6d6236-f586-44ba-bf58-17ca53e9f74d)

</details>

<details>
  <summary>모집 게시판</summary>
  
#### 모집 게시판 조회
![모집게시판](https://github.com/user-attachments/assets/cf7ebe08-8ba7-4364-8275-56275ced0188)

#### 모집 게시글 조회
![모집게시판_ 조회](https://github.com/user-attachments/assets/367ff2cb-0cfa-4c07-8301-32c61dd8d890)

#### 모집 게시글 작성
![모집게시판_작성](https://github.com/user-attachments/assets/c1921ee7-4080-4fea-8069-ad7916db1e33)

#### 모집 게시글 - 참여 신청
![모집게시판_신청](https://github.com/user-attachments/assets/17550946-52ed-4964-8296-86b1b576b6a7)

#### 모집 게시글 - 공동TO-DO방 생성
![모집게시판_공동방생성](https://github.com/user-attachments/assets/402d56d8-18f7-4659-826f-171345186ae3)

</details>

<details>
  <summary>개인 TO-DO</summary>
  
#### 개인 TO-DO
![개인투두_조회](https://github.com/user-attachments/assets/6ba4cfb0-206f-4ea0-971a-d6d2109493c8)

#### 개인 TO-DO 추가
![개인투두_투두추가](https://github.com/user-attachments/assets/5e36bad9-56d4-4762-b871-94436a9698af)

#### 개인 TO-DO 삭제
![개인투두_삭제png](https://github.com/user-attachments/assets/6c3042ca-973e-44a6-aa00-9343ee7683e0)

#### 개인 TO-DO - 카테고리 생성
![개인투도_카테고리생성](https://github.com/user-attachments/assets/071b064b-096e-4ef3-a5ac-ee3f756a2ed2)

#### 개인 TO-DO - 카테고리 삭제
![개인투두_카테고리삭제](https://github.com/user-attachments/assets/4ec4099c-b7d9-4d7b-93bf-c5959a23c03d)

#### 개인 TO-DO - 캘린더 채우기 + 성취도 표 조회
![캘린더 색깔 채우기 및 성취도 조회 ](https://github.com/user-attachments/assets/e3302d73-9e8d-4fc0-a6f7-11a77dd1452e)

#### 개인 TO-DO - TO-DO 공개 설정 (전체 공개 or 팔로우 공개)
![개인투두_팔로워공개로 변경](https://github.com/user-attachments/assets/be421940-bb28-49d7-847c-723825c5b425)

#### 개인 TO-DO - 핀 설정
![개인투두_핀설정](https://github.com/user-attachments/assets/ea1e85bc-d971-4c1f-ae1f-73b15134a7dc)

</details>

<details>
  <summary>공동 TO-DO</summary>
  
#### 공동 TO-DO 조회
![공통투두_조회](https://github.com/user-attachments/assets/cf12afc0-3100-4aae-bcbc-aca9e6c8f468)

#### 공동 TO-DO - AI를 통한 TO-DO 생성
![공통투두_AI를 통한 투두 생성](https://github.com/user-attachments/assets/43574dd1-d0ab-4ee5-9c6f-9cffcf535225)

#### 공동 TO-DO - 사용자 TO-DO 직접 생성
![공통투두_투두직접생성](https://github.com/user-attachments/assets/bc8b2d32-1799-4bbd-889f-194884eabc1a)

#### 공동 TO-DO - Appove 등록
![공동투두_Approve등록](https://github.com/user-attachments/assets/ae5c70a7-2970-4002-bf4d-4eddc3f46666)

#### 공동 TO-DO 조회 - Appove 수정
![공동투두_approve승인 수정](https://github.com/user-attachments/assets/71b98f42-3588-4d8c-b64c-254efa12954e)

#### 공동 TO-DO - 달력 채우기 및 표 성취도 조회
![공동투두_달력채우기 및 성취도 조회](https://github.com/user-attachments/assets/955d4942-2687-41d6-ba73-b839bb4fabbf)

#### 공동 TO-DO - 채팅
![공통투두_채팅](https://github.com/user-attachments/assets/f8479d96-3db2-4b4b-83ec-19b0692a4f87)

</details>


<details>
  <summary>회원 정보</summary>
  
#### 로그인
![로그인](https://github.com/user-attachments/assets/dfb9e957-03d4-40f0-89a9-058f3a5ad920)

#### 회원정보 수정 화면
![프로필_회원정보수정](https://github.com/user-attachments/assets/69bb354e-9099-4115-85a0-13a86724f8cc)

</details>

---


# UI/UX 설계

<details>
   <summary>🖼️ 와이어프레임 </summary>

  <details>
   <summary>로그인</summary>
   
   ![image](https://github.com/user-attachments/assets/0f252bb4-2aa8-459e-8c4a-cf12f8bde688)
   
</details>

<details>
   <summary>아이디 찾기</summary>

   ![image](https://github.com/user-attachments/assets/e117e946-5eb7-4bb9-9947-3933aef439f9)

   
   
</details>

<details>
   <summary>비밀번호 찾기</summary>
   
![image](https://github.com/user-attachments/assets/ac56aebf-a342-41a3-8f9d-b4e7c5098648)

   
</details>
<details>
   <summary>회원가입</summary>
   
   ![image](https://github.com/user-attachments/assets/fae950e9-7baf-470c-8bc8-86cbf1f0ecda)

</details>


<details>
   <summary>개인정보 수정</summary>

   ![image](https://github.com/user-attachments/assets/94d78326-f284-4d4f-ae71-c14a57398df0)

</details>

<details>
   <summary>팔로잉</summary>
   
   ![image](https://github.com/user-attachments/assets/fd67a622-e05f-4137-9f10-08a17fde3d2b)
   
</details>

<details>
   <summary>신고</summary>

![image](https://github.com/user-attachments/assets/ef8ccc64-e6f7-4db9-9c4e-27ded497fac7)
   
</details>

<details>
   <summary>팔로워 조회</summary>

![image](https://github.com/user-attachments/assets/68bf4cfb-7eb6-4dca-9db3-1e791ceb2958)
   
</details>


<details>
   
   <summary>팔로잉 조회</summary>
   
   ![image](https://github.com/user-attachments/assets/45dc297c-b497-41fd-a216-ff9693c091e1)
   
</details>

<details>
   <summary>todo추가</summary>
   
   ![image](https://github.com/user-attachments/assets/c6c7969d-0f8a-49bc-8905-b8a6cc74c654)

</details>

<details>
   <summary>todo 미완료</summary>

![image](https://github.com/user-attachments/assets/9af38271-9871-4427-8b46-e09c9ae0023b)
   
</details>

<details>
   <summary>DM 버튼</summary>

![image](https://github.com/user-attachments/assets/1d4e0f07-e775-4d9c-9b8a-2c36cf741f96)
   
</details>

<details>
   <summary>카테고리 설정</summary>

![image](https://github.com/user-attachments/assets/c40f4754-987d-4bf2-bcd0-e78b05b646a4)
   
</details>

<details>
   <summary>공동 TO-DO 생성</summary>
   
![image](https://github.com/user-attachments/assets/d28f9977-3974-4912-8b66-f094869401c6)
   
</details>


<details>
   <summary>공동 TO-DO APPROVE 요청</summary>
   
![image](https://github.com/user-attachments/assets/8d85927f-e764-4359-af69-adf528c332f1)
   
</details>

<details>
   <summary>모집게시판 조회</summary>
   
![image](https://github.com/user-attachments/assets/462459e4-b019-4f62-b3a6-0667d2a82402)
</details>

<details>
   <summary>공지사항 조회 - 회원</summary>

![image](https://github.com/user-attachments/assets/d433a1e7-1978-4560-a6c8-1e4064ea9422)
   
</details>

<details>
   <summary>공지사항 조회 - 관리자</summary>

![image](https://github.com/user-attachments/assets/50cdb4e8-8227-48a6-87ca-80b08295b3c2)
     
</details>

<details>
   <summary>DM 버튼</summary>

![image](https://github.com/user-attachments/assets/1d4e0f07-e775-4d9c-9b8a-2c36cf741f96)
   
</details>

<details>
   <summary>카테고리 설정</summary>

![image](https://github.com/user-attachments/assets/c40f4754-987d-4bf2-bcd0-e78b05b646a4)
   
</details>

<details>
   <summary>공동 TO-DO 생성</summary>
   
![image](https://github.com/user-attachments/assets/d28f9977-3974-4912-8b66-f094869401c6)
   
</details>


<details>
   <summary>공동 TO-DO APPROVE 요청</summary>
   
![image](https://github.com/user-attachments/assets/8d85927f-e764-4359-af69-adf528c332f1)
   
</details>

<details>
   <summary>모집게시판 조회</summary>
   
![image](https://github.com/user-attachments/assets/462459e4-b019-4f62-b3a6-0667d2a82402)
</details>

<details>
   <summary>공지사항 조회 - 회원</summary>

![image](https://github.com/user-attachments/assets/d433a1e7-1978-4560-a6c8-1e4064ea9422)
   
</details>

<details>
   <summary>공지사항 조회 - 관리자</summary>

![image](https://github.com/user-attachments/assets/50cdb4e8-8227-48a6-87ca-80b08295b3c2)
   
</details>

<details>
   <summary>공지사항 작성 - 관리자</summary>

![image](https://github.com/user-attachments/assets/7c71fd5e-696b-4156-ba71-b0c28f50875b)
   
</details>

<details>
   <summary>공지사항 수정 - 관리자</summary>
   
![image](https://github.com/user-attachments/assets/1cbd2de5-5606-4626-86ad-8eb8aef06adb)

</details>

<details>
   <summary>공지사항 삭제 - 관리자</summary>

![image](https://github.com/user-attachments/assets/c14398e3-d9e1-4add-93e0-f52c5175e21c)
</details>

<details>
   <summary>문의사항 조회 - 회원 </summary>

![image](https://github.com/user-attachments/assets/d4d6c6f3-c4ef-4521-a977-40fd9f947086)
</details>

<details>
   <summary>문의사항 조회 - 관리자</summary>

![image](https://github.com/user-attachments/assets/6770f08f-8340-4b87-9501-f795c1f71007)
</details>

<details>
   <summary>문의사항 수정 - 관리자</summary>

   ![image](https://github.com/user-attachments/assets/9905e26c-8c06-45aa-b10a-b05e837b9b16)
  
</details>

<details>
   <summary>문의사항 삭제 - 관리자</summary>

![image](https://github.com/user-attachments/assets/a3aae482-3258-4fa5-9656-4dff94afed66)
   
   
</details>

<details>
   <summary>문의사항 답변 - 관리자</summary>

![image](https://github.com/user-attachments/assets/80b26efc-6c9e-4b8c-a286-7a196945cad4)
   
</details>

</details>

---

# CI/CD 설계

<details>
   <summary>아키텍쳐</summary>
   
   ![KakaoTalk_20250503_231157971](https://github.com/user-attachments/assets/c7a648a5-49ae-4fee-ac6a-0062bba554c0)

</details>

<details>
   <summary>젠킨스 파이프라인</summary>

```groovy
pipeline {
    agent any

    tools {
        gradle 'gradle'
        jdk 'openJDK17'
    }

    environment {
        GITHUB_URL = 'https://github.com/TEAM-DDIS/be14-4th-DDIS-BE.git'
    }

    stages {
        stage('Preparation') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'docker --version'
                    } else {
                        bat 'docker --version'
                    }
                }
            }
        }

        stage('Source Build') {
            steps {
                git branch: 'dev', url: "${env.GITHUB_URL}"
                script {
                    if (isUnix()) {
                        sh "chmod +x ./DDIS_Project/gradlew"
                        sh "./DDIS_Project/gradlew clean build"
                    } else {
                        bat "cd DDIS_Project && gradlew.bat clean build -x test"
                    }
                }
            }
        }

        stage('Container Build and Push') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        if (isUnix()) {
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        } else {
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        }
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                if (isUnix()) {
                    sh 'docker logout'
                } else {
                    bat 'docker logout'
                }
            }
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}


</details>
<details>
   <summary>아르고 파이프라인</summary>

</details>

<details>
```
 </details>
 
<details>
   <summary>아르곤 파이프라인</summary>
   
   ```groovy
   pipeline {
    agent any

    tools {
        gradle 'gradle'
        jdk 'openJDK17'
    }

    environment {
        SOURCE_GITHUB_URL = 'https://github.com/TEAM-DDIS/be14-4th-DDIS-BE.git'
        MANIFESTS_GITHUB_URL = 'https://github.com/TEAM-DDIS/DDIS-manifests.git'
        GIT_USERNAME = 'tommy8969'
        GIT_EMAIL = 'tommy8969@naver.com'
    }

    stages {
        stage('Preparation') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'docker --version'
                    } else {
                        bat 'docker --version'
                    }
                }
            }
        }

        stage('Source Build') {
            steps {
                git branch: 'dev', url: "${env.SOURCE_GITHUB_URL}"
                script {
                    if (isUnix()) {
                        sh "chmod +x ./DDIS_Project/gradlew"
                        sh "./DDIS_Project/gradlew clean build"
                    } else {
                        bat "cd DDIS_Project && gradlew.bat clean build -x test"
                    }
                }
            }
        }

        stage('Container Build and Push') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                        if (isUnix()) {
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            sh "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            sh "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        } else {
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number} DDIS_Project"
                            bat "docker build -f DDIS_Project/Dockerfile -t ${DOCKER_USER}/k8s_ddis_boot:latest DDIS_Project"
                            bat "docker login -u %DOCKER_USER% -p %DOCKER_PASS%"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:${currentBuild.number}"
                            bat "docker push ${DOCKER_USER}/k8s_ddis_boot:latest"
                        }
                    }
                }
            }
        }

        stage('K8S Manifest Update') {
            steps {
                git credentialsId: 'github',
                    url: "${env.MANIFESTS_GITHUB_URL}",
                    branch: 'main'

                script {
                    withCredentials([usernamePassword(credentialsId: 'github', usernameVariable: 'GIT_USER', passwordVariable: 'GIT_PASS')]) {
                        def githubUrl = env.MANIFESTS_GITHUB_URL.replace('https://', '')
                        if (isUnix()) {
                            sh "sed -i 's/k8s_ddis_boot:.*/k8s_ddis_boot:${currentBuild.number}/g' backend-deployment.yml"
                            sh "git add backend-deployment.yml"
                            sh "git config --global user.name '${env.GIT_USERNAME}'"
                            sh "git config --global user.email '${env.GIT_EMAIL}'"
                            sh "git commit -m '[UPDATE] ${currentBuild.number} image versioning'"
                            sh "git push https://${GIT_USER}:${GIT_PASS}@${githubUrl} main"
                        } else {
                            bat "powershell -Command \"(Get-Content backend-deployment.yml) -replace 'k8s_ddis_boot:.*', 'k8s_ddis_boot:${currentBuild.number}' | Set-Content backend-deployment.yml\""
                            bat "git add backend-deployment.yml"
                            bat "git config --global user.name '${env.GIT_USERNAME}'"
                            bat "git config --global user.email '${env.GIT_EMAIL}'"
                            bat "git commit -m \"[UPDATE] ${currentBuild.number} image versioning\""
                            bat "git push https://%GIT_USER%:%GIT_PASS%@${githubUrl} main"
                        }
                    }
                }
            }
        }
    }

    post {
        always {
            script {
                if (isUnix()) {
                    sh 'docker logout'
                } else {
                    bat 'docker logout'
                }
            }
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}

</details>
```
</details>

 <details>
   <summary>테스트 결과</summary>

   ![KakaoTalk_20250503_234028435](https://github.com/user-attachments/assets/d94547c8-b8e6-4604-ab9a-44c254cf9f4f)

 </details>
</details>

---

# 설계 문서  

## 전체 설계 문서
[📄 Google 전체 설계 문서 바로가기](https://docs.google.com/spreadsheets/d/1PUN3A37981MhDW54SWZep5-JsxbDLgIV7gaxJtn7848/edit?gid=0#gid=0)

## DDD
<details>
   <summary>Bounded Context</summary>
   <img width="916" alt="image" src="https://github.com/user-attachments/assets/fca502bf-17f7-4f4b-b541-d05762d14f97" />
</details>

<details>
   <summary>Context Map</summary>
   <img width="905" alt="image" src="https://github.com/user-attachments/assets/9620515e-b6cd-4f0a-aabd-26e0a349a971" />
</details>

## 모델링
<details>
   <summary>물리적 모델링</summary>
   <img width="876" alt="image" src="https://github.com/user-attachments/assets/43c71472-0693-447f-8d47-48728facacb5" />
</details>

   

---


## 팀원 회고

| 이름   | 회고 및 느낀 점 |
|--------|----------------|
| 이성준 |                |
| 강이도은 |               |
| 고도연 |                |
| 김기종 |                |
| 주아현 |                |
| 한윤상 |                |

