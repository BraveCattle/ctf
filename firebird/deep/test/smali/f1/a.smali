.class public Lf1/a;
.super Le/a;
.source ""


# static fields
.field public static final c:D

.field public static final synthetic d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    sput-wide v0, Lf1/a;->c:D

    return-void
.end method
