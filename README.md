# Test — Android 초기 버전

Kotlin + Jetpack Compose 기반의 멀티모듈 안드로이드 프로젝트입니다.

## 요구 사항

- Android Studio (최신 안정 버전 권장)
- JDK 17
- Android SDK (API 34)

## 실행 방법

1. Android Studio에서 이 폴더를 엽니다.
2. Gradle 동기화가 끝나면 `app` 모듈을 실행합니다.

## 모듈 구조

```
:app            — 애플리케이션 모듈 (MainActivity, 매니페스트)
:core:common    — 순수 Kotlin 공통 코드 (Result, AppInfo)
:core:ui        — 공용 Compose UI (TestTheme)
:feature:home   — 홈 화면 피처 (HomeScreen)
build-logic     — 컨벤션 플러그인 (test.android.application / test.android.library / test.jvm.library)
```

의존성 방향: `app → feature:home → core:ui → core:common`

버전 관리는 `gradle/libs.versions.toml` 버전 카탈로그에서 합니다.

## 브랜치

- 작업 브랜치: `develop-moos`
