# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 23: パーティクルを追加しよう

このステップでは、カスタムパーティクル「銀のキラキラ（Silver Sparkle）」を追加します。
銀のランプが点灯しているとき、上にキラキラが舞います。

### やること
- `ModParticles.java` を作成してパーティクルタイプを登録する
- `SilverSparkleParticle.java` を作成してパーティクルの見た目と動きを定義する
- `TakanaruMod.java` に登録を追加し、クライアントでParticleProviderを登録する
- `SilverLampBlock.java` の `animateTick` でパーティクルを生成する
- パーティクル定義JSON（テクスチャ参照）を追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/particle/ModParticles.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/particle/SilverSparkleParticle.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/block/SilverLampBlock.java` | 編集 |
| `src/main/resources/assets/takanarumod/particles/silver_sparkle.json` | 新規 |

### テクスチャ
以下のテクスチャを自分で描いて配置してください（8x8ピクセルのPNG推奨）:
- `src/main/resources/assets/takanarumod/textures/particle/silver_sparkle.png`
