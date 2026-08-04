# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 19: サウンドを追加しよう

このステップでは、カスタム効果音「銀の音色（Silver Chime）」を追加します。
銀のランプがオン/オフするときに鳴ります。

### やること
- [`ModSounds.java`](src/main/java/tech/takanaru/tutorialmod/sound/ModSounds.java) を作成してサウンドイベントを登録する
- [`TakanaruMod.java`](src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java) に `ModSounds.register()` を追加する
- [`sounds.json`](src/main/resources/assets/takanarumod/sounds.json) でサウンドイベントとOGGファイルを紐づける
- [`SilverLampBlock.java`](src/main/java/tech/takanaru/tutorialmod/block/SilverLampBlock.java) でランプ切り替え時にサウンドを再生する
- 翻訳ファイルに字幕テキストを追加する

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| [`src/main/java/tech/takanaru/tutorialmod/sound/ModSounds.java`](src/main/java/tech/takanaru/tutorialmod/sound/ModSounds.java) | 新規 |
| [`src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java`](src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java) | 編集 |
| [`src/main/java/tech/takanaru/tutorialmod/block/SilverLampBlock.java`](src/main/java/tech/takanaru/tutorialmod/block/SilverLampBlock.java) | 編集 |
| [`src/main/resources/assets/takanarumod/sounds.json`](src/main/resources/assets/takanarumod/sounds.json) | 新規 |
| [`src/main/resources/assets/takanarumod/lang/en_us.json`](src/main/resources/assets/takanarumod/lang/en_us.json) | 編集 |
| [`src/main/resources/assets/takanarumod/lang/ja_jp.json`](src/main/resources/assets/takanarumod/lang/ja_jp.json) | 編集 |

### サウンドファイル
以下のサウンドファイルを用意して配置してください（OGG Vorbis形式）:
- `src/main/resources/assets/takanarumod/sounds/silver_chime.ogg`

#### OGGファイルの作り方
1. フリーの効果音サイトからWAVやMP3ファイルをダウンロード（例: [効果音ラボ](https://soundeffect-lab.info/)）
2. [Audacity](https://www.audacityteam.org/) などのツールでOGG Vorbis形式に変換して保存
3. 上記のパスに配置する

### テクスチャ
このステップでは新しいテクスチャは不要です。
