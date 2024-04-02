# algorithm-study
nhn academy algorithm study

## 스터디 진행 방법
### 스터디 목적

- 기업 코딩테스트 합격

### 프로젝트 참여 방법
- 해당 프로젝트를 Fork 받는 방법은 [Git Repository를 Fork 하는 방법](https://github.com/ParkSeolDev/algorithm-study/issues/1)를 참고하시면 됩니다.
- PR 요청 방법은 [PR를 통해 요청하는 방법](https://github.com/ParkSeolDev/algorithm-study/issues/2)를 참고하시면 됩니다.
- Git 방법은 [Git 스타일 가이드](https://github.com/ikaruce/git-style-guide)를 참조하시면 됩니다.

### Pull Request 규칙
- 반드시 main 브랜치에서 작업하지 않습니다.
    - 새로운 브랜치를 생성 후 그 위에서 작업합니다. 
- PR 요청하기 전 fetch와 rebase를 먼저 동기화를 해주세요.
    - `git fetch upstream main`
    - `git rebase upstream/main`
- 커밋 단위는 의미 단위로 쪼개주세요.
    - 수정과 리팩터링 2개 작업은 반드시 각 한 커밋으로 나눠서 올립니다.
- 마지막 줄 공백 규칙을 따릅니다.
    - 파일 끝에 빈 줄을 추가함으로써 변경 사항을 올바르게 감지 할 수 있어 공백 규칙을 적용합니다.
