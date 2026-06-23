# takanarumod

Minecraft Forge 1.20.1 のModding入門リポジトリです。

## Step 24: 村人の取引を追加しよう

このステップでは、カスタム村人職業「銀細工師（Silversmith）」を追加します。
銀のランプを作業台として使い、銀製品をエメラルドで売買できます。

### やること
- `ModVillagers.java` を作成してPOIタイプと職業を登録する
- `TakanaruMod.java` に登録を追加する
- `ModEvents.java` に `VillagerTradesEvent` ハンドラを追加して取引内容を設定する
- 翻訳ファイルに職業名を追加する

### 取引内容
| レベル | 取引 |
|--------|------|
| Lv1 | エメラルド2個 → 銀の原石3個 |
| Lv1 | 銀インゴット4個 → エメラルド1個 |
| Lv2 | エメラルド5個 → 銀のリンゴ1個 |
| Lv3 | エメラルド8個 → 銀の剣1個 |
| Lv4 | エメラルド10個 → 銀のツルハシ1個 |
| Lv5 | エメラルド15個 → 銀の探知機1個 |

### 追加・編集するファイル
| ファイル | 種類 |
|---------|------|
| `src/main/java/tech/takanaru/tutorialmod/villager/ModVillagers.java` | 新規 |
| `src/main/java/tech/takanaru/tutorialmod/TakanaruMod.java` | 編集 |
| `src/main/java/tech/takanaru/tutorialmod/event/ModEvents.java` | 編集 |
| `src/main/resources/assets/takanarumod/lang/en_us.json` | 編集 |
| `src/main/resources/assets/takanarumod/lang/ja_jp.json` | 編集 |

### テクスチャ
このステップでは新しいテクスチャは不要です。

### 確認方法
銀のランプを村に置くと、無職の村人が「銀細工師」になります。
