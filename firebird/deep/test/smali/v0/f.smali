.class public Lv0/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Landroid/graphics/Matrix;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:[F

.field public final b:[F

.field public final c:Landroid/graphics/Matrix;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    new-array v1, v0, [F

    iput-object v1, p0, Lv0/f;->a:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lv0/f;->b:[F

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lv0/f;->c:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p2, Landroid/graphics/Matrix;

    check-cast p3, Landroid/graphics/Matrix;

    .line 1
    iget-object v0, p0, Lv0/f;->a:[F

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object p2, p0, Lv0/f;->b:[F

    invoke-virtual {p3, p2}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 p2, 0x0

    :goto_0
    const/16 p3, 0x9

    if-ge p2, p3, :cond_0

    iget-object p3, p0, Lv0/f;->b:[F

    aget v0, p3, p2

    iget-object v1, p0, Lv0/f;->a:[F

    aget v2, v1, p2

    sub-float/2addr v0, v2

    aget v1, v1, p2

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    aput v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lv0/f;->c:Landroid/graphics/Matrix;

    iget-object p2, p0, Lv0/f;->b:[F

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object p1, p0, Lv0/f;->c:Landroid/graphics/Matrix;

    return-object p1
.end method